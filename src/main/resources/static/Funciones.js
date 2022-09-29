function eliminar(id) {
	swal({
  title: "Estas seguro de aliminar este archivo",
  text: "Unas vez eliminado no tendras forma de recuperarlo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	  $.ajax({
		  url:"/eliminar/"+id,
		  success: function(res) {
			  console.log(res);
		  },
	  });
    swal("Poof! tu archivo a sido eliminado!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
			location.href="/listar";
		}
	});
  } else {
    swal("Tu archivo esta asalvo!");
  }
});
}