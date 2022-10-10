/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import domain.note;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author balji
 */
public class Simplenoteservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cheak = request.getParameter("edit");
        String location = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader((location)));
        String title = br.readLine();
        String contents = br.readLine();
        br.close();

        note notes = new note(title, contents);
        
        request.setAttribute("t", notes );
        request.setAttribute("c", notes );

        if (cheak == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newtitle = request.getParameter("t");
        String newcontent = request.getParameter("c");
        note notes = new note(newtitle, newcontent);
        String location = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(location, false)));
        pw.println(notes.getTitle());
        pw.print(notes.getContents());
        request.setAttribute("notes", notes);
        pw.close();
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

   
}

