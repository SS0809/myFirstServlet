<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <script>
        async function login() {
            let username = document.getElementById("username").value;
            let password = document.getElementById("password").value;

            let response = await fetch("login", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ username: username, password: password })
            });

            let result = await response.json();
            document.getElementById("message").innerText = result.message;
        }
    </script>
</head>
<body>
    <h2>Login</h2>
    <label>Username:</label>
    <input type="text" id="username"><br><br>
    <label>Password:</label>
    <input type="password" id="password"><br><br>
    <button onclick="login()">Login</button>
    <p id="message"></p>
</body>
</html>
