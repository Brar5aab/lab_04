<%-- 
    Document   : editnote
    Created on : 3 Oct, 2022, 7:13:55 PM
    Author     : balji
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form  method="POST" action="notes">
        <div>
            <label>Title:</label>
            <input type="text" name="t" value="${notes.title}">
        </div>
        <br>
        
        
        
        <div>
            
            <label>Contents:</label>
            <textarea name="c">${notes.contents}</textarea>
        </div>
        
        
        
        <input type="submit" value="Save"> 
         </form>
    </body>
</html>
