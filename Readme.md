# WhatsApp Chatbot Backend (Spring Boot)

## 📌 Description

This project is a simple WhatsApp chatbot backend simulation built using Spring Boot.
It exposes a REST API endpoint that accepts JSON messages and returns predefined responses.

---

## 🚀 Features

* REST API endpoint: `/webhook`
* Accepts JSON input simulating WhatsApp messages
* Returns predefined responses:

  * "Hi" → "Hello"
  * "Bye" → "Goodbye"
* Logs all incoming messages in the console

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

---

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/HammadShaikh-051/WhatsApp-ChatBot-Backend.git
```

2. Open the project in Eclipse or IntelliJ

3. Run:

```
DemoApplication.java
```

4. Server will start at:

```
http://localhost:8080
```

---

## 🧪 API Testing

### Endpoint:

```
POST /webhook
```

### Full URL:

```
http://localhost:8080/webhook
```

### Request Body:

```json
{
  "message": "Hi"
}
```

### Response:

```json
{
  "reply": "Hello"
}
```

---

## 🖥️ Example Outputs

| Input       | Output    |
| ----------- | --------- |
| Hi          | Hello     |
| Bye         | Goodbye   |
| How are you | I'm fine! |

---

## 📂 Project Structure

```
src/main/java/com/example/demo
 ├── controller
 │     └── WebhookController.java
 ├── service
 │     └── ChatService.java
 ├── model
 │     ├── MessageRequest.java
 │     └── MessageResponse.java
 └── DemoApplication.java
```

---

## 📸 Screenshots

<img width="1091" height="972" alt="Screenshot 2026-04-11 002521" src="https://github.com/user-attachments/assets/2ad44943-8ac0-4500-885a-9ce70ec810c3" />

<img width="1088" height="960" alt="Screenshot 2026-04-11 002544" src="https://github.com/user-attachments/assets/91c752b1-ac56-4e4a-8ed2-dc97463e8249" />



### 🔹 Console Logs

<img width="1440" height="523" alt="Screenshot 2026-04-11 002610" src="https://github.com/user-attachments/assets/96f53b61-9a28-4f51-b0b0-64ed2b806694" />



---

## 💡 Future Improvements

* Add more dynamic chatbot responses
* Integrate with real WhatsApp API
* Deploy on cloud platforms (Render / AWS)

---

## 👨‍💻 Author

Hammad Shaikh
