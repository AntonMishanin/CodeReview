fun turnTo(direction: String) {
    if (direction == "North") {
        northAction()
    } else if (direction == "East") {
        eastAction()
    } else if (direction == "South") {
        southAction()
    } else if (direction == "West") {
        westAction()
    } else {
        print("No valid direction specified")
    }
}
