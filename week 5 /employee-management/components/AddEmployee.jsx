import React,{useState} from "react";

import {addEmployee}
from "../services/EmployeeService";
function AddEmployee(){
const [employee,setEmployee]=useState({

name:"",
email:""

});
function handleChange(e){
setEmployee({

...employee,

[e.target.name]:e.target.value

});
}



function saveEmployee(e){


e.preventDefault();


addEmployee(employee);


alert("Employee Added");


}



return(

<div className="container mt-4">


<h2>Add Employee</h2>


<form onSubmit={saveEmployee}>


<input

className="form-control mb-3"

name="name"

placeholder="Enter Name"

onChange={handleChange}

/>



<input

className="form-control mb-3"

name="email"

placeholder="Enter Email"

onChange={handleChange}

/>

<button className="btn btn-primary">

Save

</button>


</form>



</div>

)

}

export default AddEmployee;
