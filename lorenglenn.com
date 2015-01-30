<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Home|Lorenglenn.com</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		<style>
			.navbar{
				background: #000;
			}
			
			.vertical-center {
				min-height: 100%;
				min-height: 100vh;
				display: flex;
				align-items: center;
			}
			
			.glyphicon-envelope{
				font-size: 2.2em;
			}
		
			
		</style>
	
    </head>
    <body>
        <header>
		
			<!-- Nav bar -->
			<div class="navbar navbar-default navbar-fixed-top">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a href="" class="navbar-brand">Lorenglenn.com</a>
					</div>
					<div class="collapse navbar-collapse" id="example">
						<ul class="nav navbar-nav">
							<li class="active"><a href="">Home</a></li>
							<li><a href="">About Me</a></li>
							<li><a href="">Contact</a></li>
							<li>
								<button class="btn navbar-btn btn-primary dropdown-toggle" data-toggle="dropdown"">Resume/Skills<span class="caret"></span></button>
								<ul class="dropdown-menu">
									<li><a href="">Sample Sites</a></li>
									<li><a href="">Sample Programs</a></li>
									<li><a href="">Resume</a></li>
									<li><a href="">Languages</a></li>
								</ul>
							</li>
						</ul>
						<form action="" class="navbar-form navbar-right" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="search">
							</div>
							<button type="submit" class="navbar-button glyphicon glyphicon-search btn btn-primary"></button>
						</form>
					</div>
				</div>
			</div>
			
			<!-- Main title -->
			<div class="jumbotron vertical-center">
				<div class="container">
					<h1>Welcome to Loren Glenn's Portfolio!</h1>
					<p>Come in, look around and feel free to 
						<button class="btn btn-info btn-sm" role="button" data-toggle="collapse" data-target="#contact_links">contact me!</button>
						<div id="contact_links" class="collapse">
							<a href="" class="glyphicon glyphicon-envelope"></a>
							
						</div>
					</p>
				</div>	
			</div>
        </header>
		
		<body>
			<!-- About Me -->
			<div class="jumbotron vertical-center">
				<div class="container">
					<div class="carousel slide" id="about-me-images" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#about-me-images" data-slide-to="0" class="active"></li>
							<li data-target="#about-me-images" data-slide-to="1"></li>
							<li data-target="#about-me-images" data-slide-to="2"></li>
						</ol>
						<div class="carousel-inner">
							<div class="item active">
								<img src="images/newyork.jpg"  alt="Text of the image" width="100%">
								<div class="carousel-caption">
									<h3>Here we are at Time Square New York</h3>
								</div>
							</div>
							<div class="item">
								<img src="images/jill.jpg"  alt="Text of the image" width="100%">
								<div class="carousel-caption">
									<h3>Me and my beautiful wife Jill</h3>
								</div>
							</div>
							<div class="item">
								<img src="images/outdoors.jpg"  alt="Text of the image" width="100%">
								<div class="carousel-caption">
									<h3>I love the outdoors</h3>
								</div>
							</div>
						</div>
							<a href="#about-me-images" class="left carousel-control" data-slide="prev">
								<span class="glyphicon glyphicon-menu-left"></span>
							</a>
							<a href="#about-me-images" class="left carousel-control" data-slide="next">
								<span class="glyphicon glyphicon-menu-right"></span>
							</a>
					</div>	
				</div>
			</div>
				
		</body>

    <!-- Latest compiled and minified JavaScript/JQuery -->
    <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>   
    </body>
</html>
