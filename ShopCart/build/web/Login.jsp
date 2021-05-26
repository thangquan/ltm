<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>Login Form</title>
        <style>
            *{

                padding:0;
                margin: 0 auto;
            }
            html {
                height: 100%;
            }
            body {
                width: 100%;
                min-height:100%;
            }
          
            #AlertBox {
                text-align: center;
                color:red;
                font-size: 20px;
                font-weight: bold;
            }
/*            #buttonSigin {
                font-family: Poppins-Medium;
                font-size: 16px;
                color: #fff;
                line-height: 1.2;
                text-transform: uppercase;
                display: -webkit-box;
                display: -webkit-flex;
                display: -moz-box;
                display: -ms-flexbox;
              
                justify-content: center;
                align-items: center;
                padding: 0 20px;
                width: 100%;
                height: 50px;
                outline: none;
                border: none;
                border-radius: 10px;
                background: transparent;

                background-image: url(Login/images/bg-01.jpg);
            }*/
            #main {

                height: 100%;
                width: 100%;
                background-image: url(Login/images/background.jpeg);

            }

            /*            #main:before {
                            content : "";
                            display: block;
                            position: absolute;
                            top: 0;
                            left: 0;
                            background-image: url(Login/images/background.jpeg);
                            width: 100%;
                            height: 100%;
                            opacity : 0.2;
                   
                        }*/
            #logreg-forms {

            }
            #main{

                margin: 0 auto;
                /*height: 100%;*/
                background-image: url(Login/images/bg-01.jpg);
                width: 100%;
                min-height: 90vh;
                display: -webkit-box;
                display: -webkit-flex;
                display: -moz-box;
                display: -ms-flexbox;
                display: flex;
                flex-wrap: wrap;
                justify-content: center;
                align-items: center;
                background-repeat: no-repeat;
                background-position: center;
                background-size: cover;
                padding:60px 55px;
                margin-bottom: 2rem;
            }
/*            .form-signin {
                background: #fff;
            }*/
        </style>
    </head>
    <body>
        <div id="main">
            <div id="logreg-forms">
                <div><p id="AlertBox">
                        <c:choose>
                            <c:when test="${sessionScope.message==null}">
                            </c:when>
                            <c:when test="${sessionScope.message!=null}">
                                ${sessionScope.message}
                            </c:when>
                        </c:choose>
                    </p></div>
                <form class="form-signin" action="LoginControl" method="post">

                    <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>

                    <input name="user"  type="text" id="inputEmail" class="form-control" placeholder="Username" required="" autofocus="">
                    <input name="pass"  type="password" id="inputPassword" class="form-control" placeholder="Password" required="">

                    <div  style="width: 100%;" class="form-group form-check">
                        <input name="remember" value="1" type="checkbox" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Remember me</label>
                    </div>

                    <button id="buttonSigin" class="btn-success btn-block " type="submit"><i class="fas fa-sign-in-alt"></i> &nbsp;Sign in</button>
                    <hr>
                    <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i class="fas fa-user-plus"></i> Sign up New Account</button>
                </form>

                <form action="RegisterControl" method="post" class="form-signup">
                    <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign up</h1>
                    <input name="user" type="text" id="user-name" class="form-control" placeholder="User name" required="" autofocus="">
                    <input name="pass" type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus="">
                    <input name="repass" type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus="">

                    <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</button>
                    <a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i> Back</a>
                </form>


            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle() // display:block or none
                $('#logreg-forms .form-reset').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle(); // display:block or none
                $('#logreg-forms .form-signup').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
                $('#logreg-forms #cancel_reset').click(toggleResetPswd);
                $('#logreg-forms #btn-signup').click(toggleSignUp);
                $('#logreg-forms #cancel_signup').click(toggleSignUp);
            })
            $(function () {
                $('#AlertBox').removeClass('hide');
                $('#AlertBox').delay(4000).slideUp(500);
            });
        </script>
    </body>
</html>