function SubmitTestForm() {
	
	//TODO: Call postFormDataAsJson to http://localhost:8080/your/endpoint
  alert("The form was submitted successfully.");
}

/**
 * @param {Object} options
 * @param {string} options.url - the URL to POST data to
 * @param {FormData} options.formData - the `FormData` instance
 * @return {Object} - the response body from URL that was POSTed to
 */
async function postFormDataAsJson({ url, formData }) {
	
	const plainFormData = Object.fromEntries(formData.entries());
	const formDataJsonString = JSON.stringify(plainFormData);

	const fetchOptions = {
		/**
		 * Default method for a request w. fetch is GET,
		 * so we tell it to use the POST HTTP method.
		 */
		method: "POST",
		/**
		 * Headers will be added to the request and will tell
		 * the API that request body is JSON and we can
		 * accept JSON responses.
		 */
		headers: {
			"Content-Type": "application/json",
			"Accept": "application/json"
		},
		/**
		 * Body of our POST request is the JSON string that
		 * created above.
		 */
		body: formDataJsonString,
	};

	const response = await fetch(url, fetchOptions);

	if (!response.ok) {
		const errorMessage = await response.text();
		throw new Error(errorMessage);
	}

	return response.json();
}