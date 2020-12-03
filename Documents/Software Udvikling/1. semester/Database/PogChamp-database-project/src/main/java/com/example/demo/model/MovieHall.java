package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie_hall", schema = "PogChamp", catalog = "")
public class MovieHall {
    private int id;
    private int seats;
    private int hallNumber;
    private int floor;

    public MovieHall() {
    }

    public MovieHall(int id, int seats, int hallNumber, int floor) {
        this.id = id;
        this.seats = seats;
        this.hallNumber = hallNumber;
        this.floor = floor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Seats")
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Basic
    @Column(name = "Hall_number")
    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    @Basic
    @Column(name = "Floor")
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieHall that = (MovieHall) o;
        return id == that.id &&
                seats == that.seats &&
                hallNumber == that.hallNumber &&
                floor == that.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seats, hallNumber, floor);
    }
}
