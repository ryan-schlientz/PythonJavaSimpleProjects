
from flask import Flask
from flask_cors import CORS


app = Flask(__name__)
cors = CORS(app)


@app.route("/")
def hello():
    return "Hello, World!"


@app.route("/contact")
def contact():
    return "Contact Us via Email: ryan@email.com or by Phone: (555) 555-5555"


if __name__ == '__main__':
    app.run()
