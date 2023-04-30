window.onload = function() {
    var form = document.querySelector('form');
    form.onsubmit = function(event) {
        event.preventDefault();
        var fileInput = document.querySelector('input[type="file"]');
        var file = fileInput.files[0];
        if (file) {
            var url = URL.createObjectURL(file);
            var a = document.createElement('a');
            a.href = url;
            a.download = file.name;
            document.body.appendChild(a);
            a.click();
            setTimeout(function() {
                document.body.removeChild(a);
                URL.revokeObjectURL(url);  
            }, 0);   
        }    
    }
}
