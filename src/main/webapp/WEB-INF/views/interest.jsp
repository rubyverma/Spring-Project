<h2>Calculate Interest</h2>

<form method = "post" action = "interest/calculate">
<div>
<label for = "principal">Principal:</label>
<input type = "text" name = "principal" />
</div>
<div>
<label for = "rate">Rate:</label>
<input type = "text" name = "rate" />
</div>
<div>
<label for = "time">Time:</label>
<input type = "text" name = "time" />
</div>
<div>
<label for = "type">Type:</label>
<input type = "radio" name = "optionsRadios" id = "optionsRadios1" value = "Simple" checked = "checked">Simple
<input type = "radio" name = "optionsRadios" id = "optionsRadios1" value = "Compound">Compound
</div>
<input type = "submit" class = "submit-button" name = "submit" value = "Submit">
</form>