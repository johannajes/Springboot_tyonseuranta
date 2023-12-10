-- Users table to store user information
CREATE TABLE IF NOT EXISTS users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    -- Add other user-related fields as needed
    UNIQUE KEY unique_username (username)
);

-- Events table to store diary entries and calendar events
CREATE TABLE IF NOT EXISTS events (
    event_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    event_title VARCHAR(255) NOT NULL,
    event_description TEXT,
    event_date DATE,
    event_time TIME,
    due_date DATE,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);