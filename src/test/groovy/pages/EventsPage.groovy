package pages

import geb.Page

class EventsPage extends Page {
	static at = { title == "Events List" }
	static content = {
		events { $('tbody', id: "events").find('tr') }
	}

}
