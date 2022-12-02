import axios from "axios";

const EMPLOYEE_BASE_URL = "http://localhost:8088/humanresource/employees";

class EmployeeService{


    saveEmployee(employee){
        return axios.post(EMPLOYEE_BASE_URL,employee);
    }

    getEmployees(){
        return axios.get(EMPLOYEE_BASE_URL);
    }

    deleteEmployee(id){
        return axios.delete(EMPLOYEE_BASE_URL+"/"+id);
    }


    getEmployeeById(id){
        return axios.get(EMPLOYEE_BASE_URL+"/"+id);
    }

    updateEmployee(employe){
        return axios.put(EMPLOYEE_BASE_URL,employe);
    }

}

export default new EmployeeService();
