function UploadImageForm({ eventId }) {
    const handleFileUpload = (event) => {
        const formData = new FormData();
        formData.append('file', event.target.files[0]);

        // Lähetä formData POST-pyynnöllä palvelimelle
    };

    return (
        <form>
            <input type="file" onChange={handleFileUpload} />
            <button type="submit">Lataa Kuva</button>
        </form>
    );
}
