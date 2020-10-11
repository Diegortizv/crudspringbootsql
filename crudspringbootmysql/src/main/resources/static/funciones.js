function eliminar(id) {
    swal({
        title: "¿Estas seguro?",
        text: "Una vez eliminado no podrá ser recuperado",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
            .then((OK) => {
                if (OK) {
                    $.ajax({
                        url:"/eliminar/"+id,
                        success: function(res){
                            console.log(res);
                        }
                    });
                    swal("Registro eliminado", {
                        icon: "success",
                    }).then((ok)=>{
                        if (ok){
                            location.href="/listar";
                        }
                    });
                } else {
                    swal("No se han realizado cambios");
                }
            });
}