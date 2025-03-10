





#  Home Automation System

## 🔹 Overview
This **IoT-based Home Automation System** utilizes **Raspberry Pi**, **Firebase**, and a **REST API** to enable seamless **appliance control, monitoring, and automation**. A **Java-based Android app** acts as the central interface for users to interact with the system.

## 🔹 Features
 **Real-time appliance control** – Manage lights, fans, and other devices remotely.  
 **Sensor-driven automation** – Uses **motion, light, and temperature sensors** to optimize energy consumption.  
 **Secure & Scalable** – Uses **Firebase authentication** and **cloud storage** for real-time database updates.  
 **REST API Integration** – Enables easy communication between the **Raspberry Pi controller** and the **mobile app**.  
 **Android Application** – Developed in **Java**, allowing users to **control & monitor appliances remotely**.  

## 🔹 Tech Stack
- **Hardware:** Raspberry Pi, Sensors (Motion, Light, Temperature), Relays
- **Backend:** Firebase Realtime Database, REST API
- **Mobile App:** Java (Android)
- **Programming:** Python (for device control), Java (for the app)
- **Cloud Services:** Google Firebase for real-time updates

## 🔹 System Architecture
1. **Sensors & Raspberry Pi**
   - Collects data (motion, light, temperature).
   - Sends data to Firebase via REST API.

2. **Firebase Backend**
   - Stores device status updates.
   - Enables real-time sync across all devices.

3. **Android App (Java)**
   - Allows users to turn appliances ON/OFF.
   - Displays sensor data and logs historical usage.

## 🔹 Installation & Setup
1. **Clone this repository**:
   ```bash
   git clone https://github.com/AdityaInamdar334/HOME-AUTOMATION.git
   cd HOME-AUTOMATION
   ```
2. **Set up Firebase:**
   - Create a **Firebase Realtime Database**.
   - Add the Firebase config JSON file to the Android app.

3. **Run the Raspberry Pi script**:
   ```bash
   python3 automation.py
   ```
4. **Install the Android app** and connect to Firebase.

## 🔹 Future Enhancements
- **Voice Control Integration** (Google Assistant / Alexa)
- **Energy Consumption Analytics**
- **Support for Multiple Homes / Offices**

## 🔹 Repository
🔗 **[GitHub Repository](https://github.com/AdityaInamdar334/HOME-AUTOMATION)**

---
