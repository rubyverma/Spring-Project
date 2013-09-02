<h2>Contact Form</h2>

<form method = "post" action = "contacts/save">
<div>
<label for = "FirstName">First Name:</label>
<input type = "text" name = "firstName">
</div>
<br/>
<div>
<label for = "LastName">Last Name:</label>
<input type = "text" name = "lastName">
</div>
<br/>
<div>
<label for = "Email">Email:</label>
<input type = "text" name = "email">
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
<label for = Phone">Phone:</label>
<input type = "text" name = "phone">
</div>
<br/>
<div>
<label for = "Fax">Fax:</label>
<input type = "text" name = "fax">
</div>
<div>
<label for = "Address">Address:</label>
<textarea name = "address" rows = 3 columns = 20></textarea>
</div>
<br/>
<button class = "submit-button" type = "submit" name = "submit" value = "submit">Save</button>
</form>