# 🚀 Server Status Checker

Микросервис для проверки доступности серверов через REST API

## 📦 Технологии
- Java 23
- Spring Boot 3.4.4
- Maven

## 🏃 Запуск
```bash
mvn spring-boot:run
```

## 🌐 API Endpoints
```http
GET /api/status/check?url={target-url}
```

## 📝 Пример запроса
```bash
curl "http://localhost:8080/api/status/check?url=https://iis.bsuir.by"
```

## 📌 Ответ сервера
```json
{
  "serverUrl": "https://iis.bsuir.by",
  "status": "AVAILABLE",
  "timestamp": 1678901234567,
  "responseCode": 200
}
```

## 🛠️ Разработка
1. Клонируйте репозиторий
2. Импортируйте как Maven-проект
3. Запустите `DemoApplication`

## 📜 Лицензия
[MIT](LICENSE)