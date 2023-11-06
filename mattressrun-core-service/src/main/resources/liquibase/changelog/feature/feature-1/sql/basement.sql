CREATE TABLE hotel_stay
(
    id                BIGSERIAL PRIMARY KEY,
    name              VARCHAR(255),
    start_date        DATE,
    end_date          DATE,
    source_of_booking VARCHAR(255),
    points_earned     DECIMAL(19, 2),
    price_per_night   DECIMAL(19, 2),
    currency          VARCHAR(255),
    amount            DECIMAL(19, 2),
    hotel_id          VARCHAR(255)
);

CREATE TABLE hotel
(
    id            BIGSERIAL PRIMARY KEY,
    name          VARCHAR(255),
    geo_latitude  NUMERIC,
    geo_longitude NUMERIC,
    hotel_chain   VARCHAR(255),
    city          VARCHAR(255),
    address       VARCHAR(255),
    country       VARCHAR(255)
);
