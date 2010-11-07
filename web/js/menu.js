/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$("document").ready(function(){
    $(".menuItem").click(function(e){
        e.preventDefault();
        //alert(this.href);
        $("#mitte").load(this.href);
    });
});