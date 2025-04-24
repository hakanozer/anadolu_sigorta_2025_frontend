import axios from "axios";

const BASE_URL = "https://jsonbulut.com/api/";
const TIMEOUT = 15000;

const api = axios.create({
    baseURL: BASE_URL,
    timeout: TIMEOUT,
});

api.interceptors.request.use(
    (config) => {
        // Add any custom headers or configurations here
        return config;
    },
    (error) => {
        // Handle request error
        error.message = "Request error: " + error.message;
        return Promise.reject(error);
    }
);


export const jwtApi = axios.create({
    baseURL: BASE_URL,
    timeout: TIMEOUT
});

export default api;