# RailGuardian AI — Smart Railway Safety and Monitoring Platform

RailGuardian AI is a futuristic, cinematic, real-time command dashboard designed for automated railway safety operations, tracking, and diagnostics. It combines YOLOv8-powered wheel defect scanning, active RFID train monitoring, predictive maintenance forecasting, and automatic collision warnings in a unified control center shell.

---

## System Architecture

The platform consists of four main layers:

1. **Frontend (Next.js 14 + Tailwind CSS + Zustand + Framer Motion)**
   - High-fidelity Dark/Neon Glassmorphism dashboard interface.
   - Interactive SVG-based real-time train positioning map.
   - Client-side simulation fallback engine that functions standalone without backend databases.
   - Recharts telemetry visualizations.

2. **Backend Server (Node.js + Express + TypeScript + WebSockets)**
   - REST API endpoints for train configurations, signals, and alarms.
   - WebSockets event broker to pipe server-side simulation triggers (RFID scans, signals, overspeed) directly to active clients.
   - JWT authentication layer for role-based system commands (Admin, Engineer, Operator, Maintenance).

3. **AI Services (Python FastAPI + YOLOv8 + TensorFlow Core)**
   - Microservices providing simulated neural inference for wheel image inspection bounding boxes, temperature levels, and warning eta.

4. **Database (MongoDB)**
   - Persistent store for tracking records, maintenance history logs, active warning tables, and registered controllers.

---

## Technology Stack

- **Frontend:** React, Next.js, Tailwind CSS, Zustand, Recharts, Framer Motion, Lucide Icons
- **Backend:** Node.js, Express, TypeScript, Mongoose, WebSockets (`ws`), JSONWebToken (`jwt`)
- **AI Services:** Python, FastAPI, Uvicorn, YOLOv8 simulation
- **Database:** MongoDB
- **Deployment:** Docker & Docker Compose

---

## Port Configurations

- **Frontend Client:** Port `3000`
- **Backend Express API:** Port `5000`
- **AI Microservices API:** Port `8000`
- **MongoDB Instance:** Port `27017`

---

## Local Development Setup

To run the services locally in development mode:

### 1. Prerequisite: Start MongoDB
Ensure a MongoDB server is running on `mongodb://localhost:27017` or update the backend configuration environment.

### 2. Launch the Backend Server
```bash
cd backend
npm install
npm run dev
```

### 3. Launch the AI Microservices (Optional)
Ensure python is installed:
```bash
cd ai-services
pip install -r requirements.txt
python app.py
```

### 4. Launch the Frontend Application
```bash
cd frontend
npm install
npm run dev
```
Open [http://localhost:3000](http://localhost:3000) in your browser.

---

## Running with Docker Compose

To build and spin up the entire containerized suite instantly:

```bash
docker-compose up --build
```

---

## Demo Credentials (Role-based logins)

You can select any of the pre-seeded operator profiles from the login interface to explore the system:

| Operator Role | Username | Password | Full Name |
| :--- | :--- | :--- | :--- |
| **System Administrator** | `admin` | `admin123` | Vikram Singh |
| **Railway Engineer** | `engineer` | `eng123` | Priya Sharma |
| **Signal Operator** | `operator` | `op123` | Rajesh Kumar |
| **Maintenance Staff** | `maintenance` | `mt123` | Anita Desai |
