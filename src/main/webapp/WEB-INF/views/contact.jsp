<h2>Contact Form</h2>

<form method = "post" action = "savecontact">
<div>
<label for = "Name">Name:</label>
<input type = "text" name = "name">
</div>
<br/>
<div>
<label for = "Email">Email:</label>
<input type = "text" name = "mail">
</div>
<br/>
<div>
<label for = "Department">Department:</label>
<input type = "radio" name = "optionsRadios" id = "optionsRadios1" value = "Sales" checked = "checked">Sales
<input type = "radio" name = "optionsRadios" id = "optionsRadios2" value = "Marketing">Marketing
<input type = "radio" name = "optionsRadios" id = "optionsRadios3" value = "Customer Service">Customer Service
<input type = "radio" name = "optionsRadios" id = "optionsRadios4" value = "Others">Others
</div>
<br/>
<div>
<label for = "Message">Message:</label>
<textarea name = "message" rows = 3 columns = 20></textarea>
</div>
<br/>
<button class = "submit-button" type = "submit" name = "submit" value = "submit">Save</button>
</form>