# pushNotifTest

داک توضیحات:

https://docs.google.com/document/d/1mS49-nJVk4wHayKskN2dohfvea_QVLui6a3vz9Ib7G0/edit?usp=sharing
-----------------------------------------------------------
 پستمن:
اکسپورت

{
	"info": {
		"_postman_id": "4ce46024-0803-fd31-b6a9-0e63bbfe3706",
		"name": "Push Notif",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "https://fcm.googleapis.com/fcm/send",
			"request": {
				"method": "POST",
				"header": [
					{
						"key": "Authorization",
						"value": "key=***"
					},
					{
						"key": "Content-Type",
						"value": "application/json"
					}
				],
				"body": {
					"mode": "raw",
					"raw": "{\r\n \"to\" : \"f_7jBkt0xg0:APA91bHJ2Mk5Ez7xF5G9I_o6udfKf9rw0l1vIam4nnnh9xfx0xGMnUpBU5GcGPrTxhvaDtbQUaTmpQc0TiKvchKBCbe_\",\r\n \r\n \"notification\" : {\r\n     \"body\" : \"همراه کارت\" ,\r\n     \"title\": \"همراه کارت\"\r\n },\r\n \"data\" : {\r\n   \r\n     \"redirect\" : \"23\",\r\n     \"redirectId\" : \"test;0;140324829;24021737\"\r\n }\r\n}"
				},
				"url": {
					"raw": "https://fcm.googleapis.com/fcm/send",
					"protocol": "https",
					"host": [
						"fcm",
						"googleapis",
						"com"
					],
					"path": [
						"fcm",
						"send"
					]
				}
			},
			"response": []
		}
	]
}
