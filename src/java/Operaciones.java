

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.*;

public class Operaciones extends HttpServlet {
    int NUMERO1, NUMERO2=0, k=1;
    double RESU=0;
    
    String OPERACION, MSJ="";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        NUMERO1=Integer.parseInt(request.getParameter("numero1"));
        NUMERO2=Integer.parseInt(request.getParameter("numero2"));
        OPERACION=request.getParameter("operacion");
        
        
        if(OPERACION.equals("+")){
            RESU=NUMERO1+NUMERO2;
            MSJ="";
        }
        else
        if(OPERACION.equals("-")){
            RESU=NUMERO1-NUMERO2;
            MSJ="";
            
        }
        else
        if(OPERACION.equals("*")){
            RESU=NUMERO1*NUMERO2;
            MSJ="";
        }
        else
        if(OPERACION.equals("/")){
            if((NUMERO2==0))
                MSJ="Operación inválida";
            else
            RESU=NUMERO1/NUMERO2;
            MSJ="";
        }
        else
        if(OPERACION.equals("sen")){
            RESU=(Math.sin(Math.toRadians(NUMERO1)));
            MSJ="";

        }
        else
        if(OPERACION.equals("cos")){
             RESU=(Math.cos(Math.toRadians(NUMERO1)));
             MSJ="";
        }
        else
        if(OPERACION.equals("tan")){
            if(NUMERO1==90 || NUMERO2==270)
                MSJ="Operación inválida";
            else{
             RESU=(Math.tan(Math.toRadians(NUMERO1)));
             MSJ="";}
        }
        else
        if(OPERACION.equals("potencia")){
            if(NUMERO2==0)
            {RESU=1;
            MSJ="";}
            else
            {
                RESU=Math.pow(NUMERO1, NUMERO2);
            }
        }
        else
        if(OPERACION.equals("cuadrado")){
            RESU=NUMERO1*NUMERO1;
            MSJ="";
        }
        else
        if(OPERACION.equals("doble")){
            RESU=NUMERO1+NUMERO1;
            MSJ="";
        }
        else if(OPERACION.equals("")){
            RESU=0;
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletOperaciones</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><br><center><h1>El resultado de su operación es: " +RESU+ "</h1></center>");
            out.println("<h2>" +MSJ+ "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
