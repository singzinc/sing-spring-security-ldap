<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

</head>

<body>

  
   <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-body">
                        <form action="j_spring_security_check" method="post" >
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Username" id="j_username" name="j_username"  autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" id="j_password" name="j_password"  type="password" value="">
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <input  type="submit" value="Login" class="btn btn-lg btn-success btn-block"/>
                       
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
          
    </div>

  

</body>

</html>
