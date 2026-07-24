import {Link} from "react-router-dom";


function Navbar(){

return(

<nav className="navbar navbar-dark bg-dark">

<div className="container">

<Link className="navbar-brand" to="/">
Employee Management
</Link>


<Link className="btn btn-success"
to="/add">

Add Employee

</Link>


</div>

</nav>

)

}


export default Navbar;
