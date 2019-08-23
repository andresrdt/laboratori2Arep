/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;
import spark.*;
import static spark.Spark.*;
/**
 *
 * @author Andres
 */
public class main {
     private static Aplication api;
     
    public static void main(String[] args) {
        api =new Aplication();
        port(getPort());
        
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> results(req, res));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Media y derivada </h2>"
                + "<form action=\"/results\">"
                + "  * Ingrese los datos de la lista, separados por comas : <br>"
                + "  <input type=\"text\" name='lista'>"
                + "  <br>"
                + "  <br><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                + "<p> found \"\"\"/results\".</p>"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    private static String results(Request req, Response res) {
        float a;
        float b;
        api.leer(req.queryParams("lista"));
        String htm;
        htm = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<br:>" + "Media :" + api.getMedia() + "<br:>"
                + "<p>" + "Desviacion:" + api.getDesviacion() + "<p>"
                + "</body>"
                + "</html>";
        return htm;
    }
}
