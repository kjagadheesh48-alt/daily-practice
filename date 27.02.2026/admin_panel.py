import streamlit as st
import pandas as pd
from pathlib import Path
from agents.registry import AGENTS

DATA_PATH = Path("data/users.xlsx")
AGENT_PATH = Path("data/agents.csv")


def save_agents():
    AGENT_PATH.parent.mkdir(exist_ok=True)   # ← create data folder if missing

    rows = []
    for agent, roles in AGENTS.items():
        rows.append({
            "Agent Name": agent,
            "Roles": ",".join(roles)
        })

    pd.DataFrame(rows).to_csv(AGENT_PATH, index=False)


def load_agents():
    if AGENT_PATH.exists():
        df = pd.read_csv(AGENT_PATH)
        AGENTS.clear()
        for _, row in df.iterrows():
            AGENTS[row["Agent Name"]] = row["Roles"].split(",")


def admin_ui():
    st.subheader("⚙ Admin Control Center")

    # -------------------------
    # LOAD SAVED AGENTS
    # -------------------------
    load_agents()

    # -------------------------
    # FILE UPLOAD SECTION
    # -------------------------
    st.write("### 📂 Upload User Database")

    uploaded = st.file_uploader(
        "Upload Excel File",
        type=["xlsx"],
        help="Upload campus user list"
    )

    if uploaded:
        DATA_PATH.parent.mkdir(exist_ok=True)
        df_users = pd.read_excel(uploaded)
        df_users.to_excel(DATA_PATH, index=False)

        st.success("✅ User database uploaded successfully")
        st.dataframe(df_users.head())

    st.divider()

    # -------------------------
    # AGENT TABLE
    # -------------------------
    st.write("### 🤖 Current Agents")

    rows = []
    for agent, roles in AGENTS.items():
        rows.append({
            "Agent Name": agent,
            "Roles": ", ".join(roles)
        })

    df = pd.DataFrame(rows)

    st.dataframe(df, use_container_width=True)

    st.divider()

    # -------------------------
    # ADD NEW AGENT
    # -------------------------
    st.write("### ➕ Add New Agent")

    new_name = st.text_input("Agent Name")
    new_roles = st.multiselect(
        "Allowed Roles",
        ["student", "staff", "management"]
    )

    if st.button("Add Agent"):
        if not new_name:
            st.warning("Enter agent name")
        elif not new_roles:
            st.warning("Select at least one role")
        else:
            AGENTS[new_name] = new_roles
            save_agents()
            st.success("✅ Agent added & saved")
            st.rerun()