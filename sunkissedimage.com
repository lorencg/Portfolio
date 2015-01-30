<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Home|Sunkissedimage.com</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
        <style>
            html, body{
                height: 100%;
            }
            
            body {
                background: #E0FFE0;
            }
            
            .center_column {
                background: white;
                width: 70%;
                min-height: 100%
            }
            
            #main-center {
                border-left-style: groove;
                border-right-style: groove;
                border-left-width: 50px;
                border-right-width: 50px;
                
            }
            
            #nav-link {
                font-family: "Courier New";
                font-size: 20px;
                -webkit-transition: background 2s;
            }
            
            #nav-link:hover {
                background: darkgrey
            }
            
            #nav-bar {
                width: 50%;
                padding-top: 30px;
            }
        </style>
    </head>
    <body>
        <div class="container center_column" id="main-center">
            <img class="center-block" src="images/logo.jpg" height="100" width="200" alt="logo">           
            <div class="container" id="nav-bar">
                <div class="row">
                    <div class="col-xs-3">
                        <p class="text-center" id="nav-link">Home</p>
                    </div>
                    <div class="col-xs-3">
                        <p class="text-center" id="nav-link">About</p>
                    </div>
                    <div class="col-xs-3">
                        <p class="text-center" id="nav-link">Portfolio</p>
                    </div>
                    <div class="col-xs-3">
                        <p class="text-center" id="nav-link">Contact</p>
                    </div>
                </div>
            </div>
            <div class="carousel slide" id="front-page" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#front-page" data-slide-to="0" class="active"></li>
                    <li data-target="#front-page" data-slide-to="1"></li>
                    <li data-target="#front-page" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active center-block">
                        <img src="images/greg_shawn.JPG"  alt="Text of the image">
                    </div>
                    <div class="item center-block">
                        <img src="images/greg_shawn2.JPG"  alt="Text of the image">
                    </div>
                    <div class="item center-block">
                        <img src="images/kids.jpg"  alt="Text of the image">
                    </div>
                </div>
            </div>
        </div>

        <!-- Latest compiled and minified JavaScript/JQuery -->
    <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    </body>

    
    
    
    
    
    
    
</html>
