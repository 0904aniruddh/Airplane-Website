<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aniruddh's Aviation Website</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }
        header {
            background-color: #1e3d59;
            color: #fff;
            padding: 15px;
            text-align: center;
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #3e6b89;
        }
        nav a {
            color: #fff;
            padding: 14px 20px;
            text-decoration: none;
            text-align: center;
            transition: background-color 0.3s;
        }
        nav a:hover {
            background-color: #2e5075;
        }
        section {
            padding: 20px;
            display: none;
        }
        section.active {
            display: block;
        }
        h2 {
            color: #1e3d59;
        }
        .aircraft {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
            background-color: #fff;
            padding: 10px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .aircraft img {
            width: 150px;
            height: auto;
            border-radius: 5px;
            margin-right: 20px;
        }
        .aircraft .details {
            flex-grow: 1;
        }
        .aircraft .details h3 {
            margin: 0 0 10px;
        }
        .aircraft .details p {
            margin: 5px 0;
        }
        footer {
            text-align: center;
            padding: 10px;
            background-color: #1e3d59;
            color: #fff;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>Aniruddh's Aviation Website</h1>
    </header>
    <nav>
        <a href="#" onclick="showSection('home')">Home</a>
        <a href="#" onclick="showSection('airbus')">Airbus</a>
        <a href="#" onclick="showSection('boeing')">Boeing</a>
    </nav>
    <section id="home" class="active">
        <h2>Welcome to Aniruddh's Aviation Website</h2>
        <p>Explore the fascinating world of commercial airplanes. Learn more about Airbus and Boeing aircraft.</p>
    </section>
    <section id="airbus">
        <h2>Airbus Commercial Planes</h2>
        
        <div>
            <h3>Short-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/airbus_a320.jpg" alt="Airbus A320">
                <div class="details">
                    <h3>Airbus A320</h3>
                    <p>Approximate Cost: $98 million</p>
                </div>
            </div>
        </div>

        <div>
            <h3>Medium-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/airbus_a321.jpg" alt="Airbus A321">
                <div class="details">
                    <h3>Airbus A321</h3>
                    <p>Approximate Cost: $118 million</p>
                </div>
            </div>
        </div>

        <div>
            <h3>Long-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/airbus_a350.jpg" alt="Airbus A350">
                <div class="details">
                    <h3>Airbus A350</h3>
                    <p>Approximate Cost: $317 million</p>
                </div>
            </div>

            <div class="aircraft">
                <img src="https://example.com/airbus_a380.jpg" alt="Airbus A380">
                <div class="details">
                    <h3>Airbus A380</h3>
                    <p>Approximate Cost: $445 million</p>
                </div>
            </div>
        </div>
    </section>
    <section id="boeing">
        <h2>Boeing Commercial Planes</h2>
        
        <div>
            <h3>Short-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/boeing_737.jpg" alt="Boeing 737">
                <div class="details">
                    <h3>Boeing 737</h3>
                    <p>Approximate Cost: $99 million</p>
                </div>
            </div>
        </div>

        <div>
            <h3>Medium-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/boeing_757.jpg" alt="Boeing 757">
                <div class="details">
                    <h3>Boeing 757</h3>
                    <p>Approximate Cost: $120 million</p>
                </div>
            </div>
        </div>

        <div>
            <h3>Long-Haul Flights</h3>
            <div class="aircraft">
                <img src="https://example.com/boeing_777.jpg" alt="Boeing 777">
                <div class="details">
                    <h3>Boeing 777</h3>
                    <p>Approximate Cost: $361 million</p>
                </div>
            </div>

            <div class="aircraft">
                <img src="https://example.com/boeing_787.jpg" alt="Boeing 787">
                <div class="details">
                    <h3>Boeing 787</h3>
                    <p>Approximate Cost: $239 million</p>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <p>&copy; 2024 Aniruddh's Aviation Website. All rights reserved.</p>
    </footer>
    <script>
        function showSection(sectionId) {
            // Hide all sections
            const sections = document.querySelectorAll('section');
            sections.forEach(section => section.classList.remove('active'));
            
            // Show the selected section
            document.getElementById(sectionId).classList.add('active');
        }
    </script>
</body>
</html>

