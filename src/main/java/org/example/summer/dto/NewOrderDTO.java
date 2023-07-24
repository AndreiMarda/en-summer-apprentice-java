package org.example.summer.dto;

public class NewOrderDTO {
    private int TicketCategoryId;
    private Integer numberOfTickets;
    public NewOrderDTO(){}

    public NewOrderDTO(String ticketCategoryId, Integer numberOfTickets) {
        this.TicketCategoryId = Integer.parseInt(ticketCategoryId);
        this.numberOfTickets = numberOfTickets;
    }

    public int getTicketCategoryId() {
        return TicketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        TicketCategoryId = ticketCategoryId;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
