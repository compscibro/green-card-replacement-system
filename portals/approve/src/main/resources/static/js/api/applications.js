import { API_BASE } from "../config.js";

// --- Fetch ALL reviewed applications ---
export async function getApplications() {
    const res = await fetch(`${API_BASE}/list`);
    const data = await res.json();

    return data.map(app => ({
        id: app.id,
        name: `${app.firstName ?? "N/A"} ${app.lastName ?? ""}`.trim(),
        reason: app.reasonForReplacement ?? "N/A"
    }));
}

// --- Fetch ONE application by ID ---
export async function getApplicationById(id) {
    const res = await fetch(`${API_BASE}/${id}`);
    const app = await res.json();

    return {
        id: app.id,
        name: `${app.firstName ?? "N/A"} ${app.lastName ?? ""}`.trim(),
        dob: app.dateOfBirth ?? "N/A",
        email: app.emailAddress ?? "N/A",
        phone: app.phoneNumber ?? "N/A",
        reason: app.reasonForReplacement ?? "N/A",
        uscis: app.uscisNumber ?? "N/A",
        address: `${app.streetAddress ?? ""}, ${app.city ?? ""}, ${app.state ?? ""} ${app.zipcode ?? ""}`,
        notes: app.reviewNotes ?? "N/A"
    };
}

// --- Approve application ---
export async function approveApplication(id) {
    await fetch(`${API_BASE}/${id}/approve?notes=Approved&approvedBy=Admin`, {
        method: "POST"
    });
    alert("Application approved!");
    window.location.href = "/";
}

// --- Reject application ---
export async function rejectApplication(id) {
    await fetch(`${API_BASE}/${id}/reject?notes=Rejected&approvedBy=Admin`, {
        method: "POST"
    });
    alert("Application rejected!");
    window.location.href = "/";
}
