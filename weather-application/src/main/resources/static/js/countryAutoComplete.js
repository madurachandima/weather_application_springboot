values = [
    {label: "United Arab Emirates", id: "AE"},
    {label: "Afghanistan", id: "AF"},
    {label: "Antigua and Barbuda", id: "AG"},
    {label: "Anguilla", id: "AI"},
    {label: "Armenia", id: "AM"},
    {label: "Netherlands Antilles", id: "AN"},
    {label: "Angola", id: "AO"},
    {label: "Antarctica", id: "AQ"},
    {label: "Argentina", id: "AR"},
    {label: "American Samoa", id: "AS"},
    {label: "Austria", id: "AT"},
    {label: "Australia", id: "AU"},
    {label: "Aruba", id: "AW"},
    {label: "Aland Islands", id: "AX"},
    {label: "Azerbaijan", id: "AZ"},
    {label: "Bosnia and Herzegovina", id: "BA"},
    {label: "Barbados", id: "BB"},
    {label: "Bangladesh", id: "BD"},
    {label: "Belgium", id: "BE"},
    {label: "Brazil", id: "BR"},
    {label: "Canada", id: "CA"},
    {label: "Germany", id: "DE"},
    {label: "Egypt", id: "EG"},
    {label: "Spain", id: "SP"},
    {label: "Hong Kong", id: "HK"},
    {label: "India", id: "IN"},
    {label: "Japan", id: "JP"},
    {label: "Sri Lanka", id: "LK"},
    {label: "New Zealand", id: "NZ"},
    {label: "South Africa", id: "ZA"},
];
let countryID = new Map();
$(function () {
    $("#search_country").autocomplete({
        source: values,
        select: function (event, ui) {
            $("#search_country").val(ui.item.label);
            countryID.set("countryID", ui.item.id);
            console.log(ui.item.id);
            return false;
        }
    });
});
