const axios = require("axios").default;

const axiosInstance = axios.create({
  baseURL: "http://localhost:8080",
  timeout: 1000,
  // headers: {'X-Custom-Header': 'foobar'}
});

export default axiosInstance;