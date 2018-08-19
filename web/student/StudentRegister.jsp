<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="../css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../css/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="../css/css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
        <div class="card-header"><h3><b>Register an Account</b></h3></div>
      <div class="card-body">
          <form action="../StudentRegister" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                
              </div>
            </div>
          </div>
          <div class="form-group" >
              <label for="exampleInputName"><b>National ID number</b></label>
                <input class="form-control" name="id" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="Enter university ID" required>
                <br>
            <label for="exampleInputEmail1"><b>Student Name</b></label>
            <input class="form-control" name="stu_name" id="exampleInputEmail1" type="text" aria-describedby="emailHelp" placeholder="Enter your name" required>
            
                <br>
            <label for="exampleInputEmail1"><b>Telephone number</b></label>
            <input class="form-control" name="tell" id="exampleInputEmail1" type="text" aria-describedby="emailHelp" placeholder="Enter telephone number" required>
            
            <br>
            <label for="exampleInputPassword1"><b>University</b></label>
                <input class="form-control" name="cam_name" id="exampleInputPassword1" type="text" placeholder="University name" required>
                <br>
            <label for="exampleInputPassword1"><b>Password</b></label>
                <input class="form-control" name="pass" id="exampleInputPassword1" type="password" placeholder="Password" required>
                
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                
              </div>
      
            </div>
          </div>
          <input class="btn btn-primary btn-block" type="submit" value="Register" />
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="">Login Page</a>
          
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
