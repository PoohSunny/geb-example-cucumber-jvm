package pages

import geb.Page

class EventsPage extends Page {
	static at = { title == "Events List" }
	static content = {
		events(wait: true) { $('tbody', id: "events").find('tr') }
		firstEventLink { events.find('a', 0) }
	}

}
