import React,{useState,useEffect} from "react";

import {getEmployees,deleteEmployee}
from "../services/EmployeeService";

function EmployeeList(){


const [employees,setEmployees]=useState([]);

useEffect(()=>{

loadEmployees();

},[]);

function loadEmployees(){

getEmployees()
.then(response=>{

setEmployees(response.data);

})


}

function removeEmployee(id){

deleteEmployee(id)
.then(()=>{

loadEmployees();

})


}




return(

<div className="container mt-4">


<h2>
Employee List
</h2>



<table className="table table-bordered">


<thead>

<tr>

<th>ID</th>

<th>Name</th>

<th>Email</th>

<th>Action</th>


</tr>


</thead>



<tbody>


{

employees.map(employee=>(


<tr key={employee.id}>


<td>{employee.id}</td>


<td>{employee.name}</td>


<td>{employee.email}</td>



<td>


<button

className="btn btn-danger"

onClick={()=>removeEmployee(employee.id)}

>

Delete

</button>


</td>


</tr>



))


}


</tbody>



</table>



</div>

)


}


export default EmployeeList;
