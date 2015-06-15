package pages

import geb.Page

class EventsPage extends Page {
	static at = { title == "http://agilesamuraibasecamp.github.io/asbc2013-js/" }
	static content = {
		events { $('tbody', id: "events").find('tr') }
	}

}
