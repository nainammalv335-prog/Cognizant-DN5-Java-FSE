import axios from "axios";


const API="http://localhost:8080/employees";


export const getEmployees=()=>{

return axios.get(API);

}
export const addEmployee=(employee)=>{

return axios.post(API,employee);

}
export const deleteEmployee=(id)=>{

return axios.delete(API+"/"+id);

}
