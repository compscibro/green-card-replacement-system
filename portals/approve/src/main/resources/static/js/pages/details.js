import {
    getApplicationById,
    approveApplication,
    rejectApplication
} from "../api/applications.js";

async function loadDetails() {
    const params = new URLSearchParams(window.location.search);
    const id = params.get("id");

    const app = await getApplicationById(id);
    const card = document.getElementById("detailsCard");

    card.innerHTML = `
        <h2>${app.name}</h2>
        <p style="color:#777; margin-bottom:15px;">Application ID: ${id}</p>

        <div class="details-grid">
            <div>
                <strong>Date of Birth</strong>
                ${app.dob}
            </div>
            <div>
                <strong>USCIS Number</strong>
                ${app.uscis}
            </div>
            <div>
                <strong>Reason</strong>
                ${app.reason}
            </div>
            <div>
                <strong>Email</strong>
                ${app.email}
            </div>
            <div>
                <strong>Phone</strong>
                ${app.phone}
            </div>
            <div>
                <strong>Address</strong>
                ${app.address}
            </div>
        </div>

        <div class="notes-box">
            <strong style="color:#444;">Reviewer Notes</strong>
            <p style="margin-top:6px;">${app.notes}</p>
        </div>
    `;

    document.getElementById("approveBtn").onclick = () => approveApplication(id);
    document.getElementById("rejectBtn").onclick = () => rejectApplication(id);
}

window.onload = loadDetails;
