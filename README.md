<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SmartAuto</title>

<style>
:root {
    --red: #ff1e1e;
    --dark: #0c0c0f;
    --blue-dark: #0a1f44;
}

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    scroll-behavior: smooth;
}

body {
    font-family: 'Segoe UI', sans-serif;
    background: linear-gradient(135deg, var(--dark), var(--blue-dark));
    color: #e6e6e6;
}

/* Navigation */
nav {
    position: fixed;
    width: 100%;
    top: 0;
    background: rgba(0,0,0,0.6);
    backdrop-filter: blur(10px);
    padding: 15px 40px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    z-index: 1000;
}

nav h2 {
    color: var(--red);
    letter-spacing: 2px;
}

nav a {
    color: #ccc;
    text-decoration: none;
    margin-left: 20px;
    transition: 0.3s;
}

nav a:hover {
    color: var(--red);
}

/* Hero Section */
.hero {
    height: 100vh;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    text-align: center;
    padding: 20px;
}

.hero h1 {
    font-size: 60px;
    color: var(--red);
    margin-bottom: 20px;
}

.hero p {
    max-width: 700px;
    line-height: 1.6;
    color: #bbb;
}

/* Animated Car */
.road {
    position: relative;
    width: 100%;
    height: 150px;
    margin-top: 40px;
    overflow: hidden;
}

.road::after {
    content: "";
    position: absolute;
    width: 200%;
    height: 4px;
    top: 90px;
    background: repeating-linear-gradient(
        to right,
        white 0px,
        white 40px,
        transparent 40px,
        transparent 80px
    );
    animation: roadMove 2s linear infinite;
}

@keyframes roadMove {
    from { transform: translateX(0); }
    to { transform: translateX(-80px); }
}

.car {
    position: absolute;
    bottom: 50px;
    left: -160px;
    width: 140px;
    height: 50px;
    background: var(--red);
    border-radius: 25px 25px 10px 10px;
    animation: drive 6s linear infinite;
    box-shadow: 0 0 20px rgba(255, 0, 0, 0.7);
}

.wheel {
    position: absolute;
    bottom: -15px;
    width: 32px;
    height: 32px;
    background: black;
    border-radius: 50%;
    border: 3px solid #444;
}

.wheel.front { right: 15px; }
.wheel.back { left: 15px; }

@keyframes drive {
    from { left: -160px; }
    to { left: 110%; }
}

/* Features Section */
.features {
    padding: 100px 40px;
    text-align: center;
}

.features h2 {
    margin-bottom: 50px;
    color: var(--red);
    font-size: 36px;
}

.card-container {
    display: flex;
    justify-content: center;
    gap: 30px;
    flex-wrap: wrap;
}

.card {
    background: rgba(255,255,255,0.05);
    border: 1px solid rgba(255,255,255,0.1);
    backdrop-filter: blur(10px);
    padding: 30px;
    width: 280px;
    border-radius: 15px;
    transition: 0.3s ease;
}

.card:hover {
    transform: translateY(-10px);
    box-shadow: 0 0 25px rgba(255, 0, 0, 0.5);
}

.card h3 {
    color: var(--red);
    margin-bottom: 15px;
}

/* Footer */
footer {
    text-align: center;
    padding: 30px;
    background: #0a0a0d;
    color: #777;
}
</style>
</head>

<body>

<nav>
    <h2>SmartAuto</h2>
    <div>
        <a href="#home">Home</a>
        <a href="#features">Features</a>
    </div>
</nav>

<section class="hero" id="home">
    <h1>SmartAuto</h1>
    <p>
        A structured object-oriented system that manages car data and service history
        using Program, Car, and Service classes.
    </p>

    <div class="road">
        <div class="car">
            <div class="wheel back"></div>
            <div class="wheel front"></div>
        </div>
    </div>
</section>

<section class="features" id="features">
    <h2>Project Structure</h2>
    <div class="card-container">
        <div class="card">
            <h3>Program Class</h3>
            <p>Controls execution and connects all system components.</p>
        </div>

        <div class="card">
            <h3>Car Class</h3>
            <p>Stores vehicle details such as name, owner, and kilometers driven.</p>
        </div>

        <div class="card">
            <h3>Service Class</h3>
            <p>Manages maintenance history and service records.</p>
        </div>
    </div>
</section>

<footer>
    SmartAuto Project • Developed by Lima Santos
</footer>

</body>
</html>
