<%-- 
    Document   : viewnote
    Created on : 3 Oct, 2022, 7:14:25 PM
    Author     : balji
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>SIMPLE NOTE KEEPER</h1>
        <h2>View Note</h2>
       
        <div>
            
            Title: ${note.title}
     
        </div>
        <br>
         
         <div>
             
             Contents: ${note.contents}
          
          </div>
      <br>
        <br>
          <a href="note?edit">Edit</a>
    </body>
</html>

