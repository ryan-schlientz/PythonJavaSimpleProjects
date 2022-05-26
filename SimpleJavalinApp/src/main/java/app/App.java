package app;

import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());

        //Establish our Routes
        establishRoutes(app);

        //Javalin does, by default, run on Port 7000
        app.start();

    }

    private static void establishRoutes(Javalin app) {

        app.get("/hello", (context) -> context.result("Hello World!"));
    }
}