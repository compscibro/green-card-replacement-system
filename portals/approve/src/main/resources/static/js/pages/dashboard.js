import { getApplications } from "../api/applications.js";
import { createElement } from "../utils/dom.js";

async function loadDashboard() {
    const container = document.getElementById("appList");
    container.innerHTML = ""; // Clear old content

    const apps = await getApplications();

    if (apps.length === 0) {
        container.innerHTML = `<p>No reviewed applications available.</p>`;
        return;
    }

    apps.forEach(app => {
        const item = createElement("div", "list-item");
        item.innerHTML = `
            <div class="left">
                <strong>${app.name}</strong>
                <small>ID: ${app.id}</small>
                <small>Reason: ${app.reason}</small>
            </div>
            <div class="arrow">›</div>
        `;

        item.onclick = () => {
            window.location.href = `/application.html?id=${app.id}`;
        };

        container.appendChild(item);
    });
}

window.onload = loadDashboard;
