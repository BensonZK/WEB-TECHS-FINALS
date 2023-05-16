<!DOCTYPE html>
<html>
    <head>
        <title>Ajax Lesson</title>
        <script>
            function getItems(){
                var req = new XMLHttpRequest();
                req.open("GET", "Items.jsp", false);
                req.send(null);
                
                if(req.status === 200){
                   // alert(req.responseText);
                    document.getElementById("contents").innerHTML = req.responseText;
                }else {
                    document.getElementById("contents").innerHTML ="Error in processing Ajax";
                }
            }
        </script>
    </head>
    <body>
        <h1>See the items added to cart</h1>
        <input type="button" value="Click here to see the items added to cart"  onclick="getItems();"/>
        <div id="contents">
            Items in the cart
        </div>
    </body>
</html>
