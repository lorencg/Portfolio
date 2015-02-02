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
			body {
				padding-top: 40px;
			}
			
			
			.glyphicon-envelope{
				padding-top: 30px;
				font-size: 2.2em;
			}
			
		</style>
	
    </head>
    <body>
		
			<!-- Nav bar -->
			<div class="navbar navbar-inverse navbar-fixed-top" id="main-navbar">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#port">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a href="" class="navbar-brand navbar-left">Lorenglenn.com</a>
					</div>
					<div class="collapse navbar-collapse" id="port">
						<ul class="nav navbar-nav">
							<li><a href="#home">Home</a></li>
							<li><a href="#about-me">About Me</a></li>
							<li><a href="#contact">Contact</a></li>
							<li><a href="#quotes">Quotes</a></li>
							<li>
								<button class="btn navbar-btn btn-primary dropdown-toggle navbar-right" data-toggle="dropdown">Resume/Skills<span class="caret"></span></button>
								<ul class="dropdown-menu">
									<li><a href="#sample-sites">Sample Sites</a></li>
									<li><a href="#sample-program">Sample Programs</a></li>
									<li><a href="#resume">Resume</a></li>
									<li><a href="#languages">Languages</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
			
			<!-- Main title -->
			<div class="jumbotron" id="home">
				<hr>
				<div class="container text-center">
					<h1>Welcome to Loren Glenn's Portfolio!</h1>
					<p>Come in, look around and feel free to: </p>
					<button class="btn btn-info btn-sm" role="button" data-toggle="collapse" data-target="#contact_links">Contact me!</button>
						<div id="contact_links" class="collapse">
							<a href="" class="glyphicon glyphicon-envelope"></a>
							
						</div>
				</div>
				<hr>				
			</div>
			
			<!-- Quotes -->
			<div class="container">
				<section>
					<div class="page-header" id="quotes">
						<h2>My Favorite Quotes - <small>That I try to live by: </small><h2>
					</div>
					
					<div class="row">
						<div class="col-lg-4">
							<blockquote>
								<p>"On occasion we need to make a second effort - and a third effort, and a fourth effort, and as many degrees of effort as may be required to accomplish what we strive to achieve."</p>
								<footer>Thomas S. Monson</footer>
							</blockquote>
						</div>
						<div class="col-lg-4">
							<blockquote>
								<p>"Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it."</p>
								<footer>Steve Jobs</footer>
							</blockquote>
						</div>
						<div class="col-lg-4">
							<blockquote>
								<p>"Treat those who are good with goodness, and also treat those who are not good with goodness. Thus goodness is attained. Be honest to those who are honest, and be also honest to those who are not honest. Thus honesty is attained."</p>
								<footer>Lao Tzu</footer>
							</blockquote>
						</div>
					</div>
				</section>
			</div>
			
			<!-- Subscribe -->
			<section>
				<div class="well">
					<div class="container text-center">
						<h3>Subscribe to my newsletter to hear about my new projects!</h3>
						<p>Enter your name and email</P>
						
						<form action="" class="form-inline">
							<div class="form-group">
								<label for="subscription">Subscribe</label>
								<input type="text" class="form-control" id="subscription" placeholder="Your name">
							</div>
							<div class="form-group">
								<label for="email">Email address</label>
								<input type="text" class="form-control" id="email" placeholder="Your email">
							</div>
							<button type="submit" class="btn btn-warning">Submit</button>
						</form>
						<hr>
					</div>
				</div>
			</section>
				
			<!-- About Me -->
			<div class="container">
				<section>
					<div class="page-header" id="about-me">
						<h2>About Me. <small> A small gallery of me and my hobbies:</small></h2>
					</div>
				</section>
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
					</div>	
				</div>
				
		</body>

    <!-- Latest compiled and minified JavaScript/JQuery -->
    <script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>   
    </body>
</html>
