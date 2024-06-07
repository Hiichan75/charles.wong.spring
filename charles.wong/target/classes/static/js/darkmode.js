function toggleDarkMode() {
    const body = document.body;
    body.classList.toggle("dark-mode");

    const elements = document.querySelectorAll(".navbar, .table, .btn, .footer");
    elements.forEach(element => {
        element.classList.toggle("dark-mode");
    });

    // Save preference in localStorage
    if (body.classList.contains("dark-mode")) {
        localStorage.setItem("darkMode", "enabled");
    } else {
        localStorage.setItem("darkMode", "disabled");
    }
}

// Apply saved preference on page load
document.addEventListener("DOMContentLoaded", () => {
    if (localStorage.getItem("darkMode") === "enabled") {
        toggleDarkMode();
        document.getElementById("darkModeToggle").checked = true;
    }
});
