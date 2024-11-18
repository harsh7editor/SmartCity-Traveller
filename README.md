![Screenshot 2024-11-18 112843](https://github.com/user-attachments/assets/35a3af9c-d04f-4de3-9f01-5eec794e0c78)

<h1 align="center"> Smart-City-Traveller </h1>
<p align="center">

# Requirements

- Android Studio
- minimum 4GB RAM
- minimum 2GB Storage
- FourSquare API (version 3 `v3`)
- Google Maps API
- Working Internet Connection

### 1. Changing Foursquare Api
- Login with foursquare account and get Authroization code
- Now go to : [app\src\main\res\values\strings.xml](app\src\main\res\values\strings.xml)
- and replace `AUTH_ID` with your own foursquare authroization code.

### 2. Change the Google Maps Api
- Get [Google Map api](https://developers.google.com/maps/documentation/android/signup)
- Now go to : [app\src\release\res\values\google_maps_api.xml](app\src\release\res\values\google_maps_api.xml)
- and replace the "google_maps_key" with your own google map api key.
