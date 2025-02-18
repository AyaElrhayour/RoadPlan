# RoadPlan

RoadPlan is a travel planning platform designed to help users discover destinations and create personalized travel itineraries based on their preferences.

## Architecture



## API Reference

#### Signup

```http
  POST /api/user/register
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Required**. Username of the user wanting to register |
| `password` | `string` | **Required**. Password of the user wanting to register |
| `role` | `string` | **Required**. Role of the user wanting to register |

#### Get User By Username

```http
  GET /api/users/${username}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `username`      | `string` | **Required**. Username of the  user wanting to get|

#### Get All Users

```http
  GET /api/users
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of the authenticated user |
| `username`      | `string` | **Required**. Username of the user |
| `password`      | `string` | **Required**. Password of the user |
| `role`      | `string` | **Required**. Role of the user |

## Tech Stack

**Server:** SpringBoot, Hibernate, Jpa

**Frontend:** Angular

**Styling:** CSS, Angular Material UI

**Mapping:** MapStruct

**Security:** Spring Security

**Unit Testing:** JUnit, Mockito

**Database:** PostgreSql


## Feedback

If you have any feedback, please reach out to us at ayaelrhayour123@gmail.com
