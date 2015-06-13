@PaletteItemRegistrations({
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Audio",
            icon16 = "com/mycompany/html5palette/icons/audio.png",
            icon32 = "com/mycompany/html5palette/icons/audio32.png",
            body = "<audio src=\"somefile.mp3\" controls loop autoplay></audio>",
            tooltip = "<audio src= controls loop autoplay></audio>",
            name = "Audio"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Video",
            icon16 = "com/mycompany/html5palette/icons/video.png",
            icon32 = "com/mycompany/html5palette/icons/video32.png",
            body = "<video src=\"somefile.mp4\" controls width=\"340\" height=\"210\"></video>",
            tooltip = "<video src= controls width= height=></video>",
            name = "Video"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Color",
            icon16 = "com/mycompany/html5palette/icons/color.png",
            icon32 = "com/mycompany/html5palette/icons/color32.png",
            body = "<label for=myfavcolor>Favorite Color: </label>\n"
            + "<input id=\"myfavcolor\" \n"
            + "       oninput=\"changeBackground(myfavcolor.value)\" \n"
            + "       type=\"color\" \n"
            + "       value=\"#333333\" \n"
            + "       list=\"colors\">\n"
            + "<datalist id=colors>\n"
            + "    <option>#ffffff</option>\n"
            + "    <option>#3dc283</option>\n"
            + "    <option>#ff7700</option>\n"
            + "</datalist>\n"
            + "<script>\n"
            + "    function changeBackground(selectedcolor) {\n"
            + "        document.body.style.backgroundColor = selectedcolor;\n"
            + "    }\n"
            + "</script>",
            tooltip = "<input type=\"color\" />",
            name = "Color"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Calendar",
            icon16 = "com/mycompany/html5palette/icons/date.png",
            icon32 = "com/mycompany/html5palette/icons/date32.png",
            body = "<p>Date: <input type=date step=7 min=2014-09-08> <!-- Monday only --></p>\n"
            + "<p>Time: <input type=time min=09:00 max=17:00 step=900> <!-- 15m increments --></p>\n"
            + "<p>Week: <input type=week step=2 min=2014-W30></p>",
            tooltip = "<input type=\"date\" />",
            name = "Calendar"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Drag",
            icon16 = "com/mycompany/html5palette/icons/drag.png",
            icon32 = "com/mycompany/html5palette/icons/drag32.png",
            body = "<script>\n"
            + "    function allowDrop(ev) {\n"
            + "        ev.preventDefault();\n"
            + "    }\n"
            + "    function drag(ev) {\n"
            + "        ev.dataTransfer.setData(\"text\", ev.target.id);\n"
            + "    }\n"
            + "    function drop(ev) {\n"
            + "        ev.preventDefault();\n"
            + "        var data = ev.dataTransfer.getData(\"text\");\n"
            + "        var label = document.getElementById(data);\n"
            + "        ev.target.appendChild(label);\n"
            + "        var parent = label.parentNode.id;\n"
            + "        label.innerHTML = 'dropped on area' + parent;\n"
            + "    }\n"
            + "</script>\n"
            + "<div id=\"1\" style=\"width:350px;height:70px;padding:10px;\n"
            + "     border:1px solid #aaaaaa;\" \n"
            + "     ondrop=\"drop(event)\" \n"
            + "     ondragover=\"allowDrop(event)\">\n"
            + "</div>\n"
            + "<br/><br/>\n"
            + "<div id=\"2\" style=\"width:350px;height:70px;padding:10px;\n"
            + "     border:1px solid #aaaaaa;\" \n"
            + "     ondrop=\"drop(event)\" \n"
            + "     ondragover=\"allowDrop(event)\">\n"
            + "</div>\n"
            + "<br/>\n"
            + "<label id=\"drag\" \n"
            + "       draggable=\"true\" \n"
            + "       ondragstart=\"drag(event)\">drag me</label>",
            tooltip = "<label draggable=\"true\" ondragstart=\"drag(event)\">drag me</label>",
            name = "Drag"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Range",
            icon16 = "com/mycompany/html5palette/icons/range.png",
            icon32 = "com/mycompany/html5palette/icons/range32.png",
            body = "<label for=myRange>Volume:</label>\n"
            + "<input type=range \n"
            + "       min=0 \n"
            + "       max=100 \n"
            + "       value=50 \n"
            + "       id=myRange \n"
            + "       step=1\n"
            + "       list=volsettings\n"
            + "       oninput=\"outputUpdate(value)\">\n"
            + "<datalist id=volsettings>\n"
            + "    <option>0</option>\n"
            + "    <option>20</option>\n"
            + "    <option>40</option>\n"
            + "    <option>60</option>\n"
            + "    <option>80</option>\n"
            + "    <option>100</option>\n"
            + "</datalist>\n"
            + "<output for=myRange id=volume>50</output>\n"
            + "<script>\n"
            + "    function outputUpdate(vol) {\n"
            + "        document.querySelector('#volume').value = vol;\n"
            + "    }\n"
            + "</script>",
            tooltip = "<input type=\"range\" />",
            name = "Range"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Required",
            icon16 = "com/mycompany/html5palette/icons/required.png",
            icon32 = "com/mycompany/html5palette/icons/required32.png",
            body = "<form>\n"
            + "<label for=\"movie\">What is your favorite movie : </label>\n"
            + "<input name=\"movie\" type=\"text\" required />\n"
            + "<input type=\"submit\" value=\"Submit\"/> \n"
            + "</form>",
            tooltip = "<input type=\"text\" required />",
            name = "Required"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Mail",
            icon16 = "com/mycompany/html5palette/icons/email.png",
            icon32 = "com/mycompany/html5palette/icons/email32.png",
            body = "<form onsubmit=\"outputUpdate();return false\" name=\"myform\">\n"
            + "    <label for=\"mail\">Enter your mail: </label>\n"
            + "    <input id=\"mail\" name=\"mymail\" type=\"email\" multiple required />\n"
            + "    <input type=\"submit\" value=\"Submit\"/> \n"
            + "    <hr>\n"
            + "    <br/>\n"
            + "    <output for=mymail name=\"myoutput\"></output>\n"
            + "    <script>\n"
            + "        function outputUpdate() {\n"
            + "            var mymailValue = document.myform.mymail.value;\n"
            + "            document.myform.myoutput.value = 'Your mail is: ' + mymailValue;\n"
            + "        }\n"
            + "    </script>\n"
            + "</form>",
            tooltip = "<input type=\"email\" required />",
            name = "Mail"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "DataList",
            icon16 = "com/mycompany/html5palette/icons/datalist.png",
            icon32 = "com/mycompany/html5palette/icons/datalist32.png",
            body = "<form onsubmit=\"outputUpdate();return false\" name=\"myform\">\n"
            + "    <label for=\"country_name\">Country: </label>\n"
            + "    <input id=\"country_name\" \n"
            + "           name=\"mycountry\" \n"
            + "           type=\"text\" \n"
            + "           required\n"
            + "           list=\"country\" />\n"
            + "    <datalist id=\"country\">\n"
            + "        <option value=\"Afghanistan\">\n"
            + "        <option value=\"Albania\">\n"
            + "        <option value=\"Algeria\">\n"
            + "        <option value=\"Andorra\">\n"
            + "        <option value=\"Angola\">\n"
            + "    </datalist>\n"
            + "    <input type=\"submit\"/>\n"
            + "    <br/>\n"
            + "    <hr>\n"
            + "    <output name=myoutput></output>\n"
            + "    <script>\n"
            + "        function outputUpdate() {\n"
            + "            var myCountryValue = document.myform.mycountry.value;\n"
            + "            document.myform.myoutput.value = 'Your country is: ' + myCountryValue;\n"
            + "        }\n"
            + "    </script>\n"
            + "</form>",
            tooltip = "<datalist id=\"\"><option value=\"\"></datalist>",
            name = "Data List")
})
package com.mycompany.html5palette;

import org.netbeans.spi.palette.PaletteItemRegistration;
import org.netbeans.spi.palette.PaletteItemRegistrations;
